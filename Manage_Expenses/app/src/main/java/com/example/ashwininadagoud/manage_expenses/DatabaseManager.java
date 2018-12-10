package com.example.ashwininadagoud.manage_expenses;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class DatabaseManager extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "MANAGE_EXPENSES";
    private static final int DATABASE_VERSION=1;
    private static final String TABLE_NAME = "EXPENSE_TABLE";

    public DatabaseManager(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db)
    {
        String command = "create table " + TABLE_NAME + "(" +
                "_ID integer primary key autoincrement, " +
                "NAME text, " + "PRICE real, " + "DATE text)";
        db.execSQL(command);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }

    public void insert(ExpenseList expenseList)
    {
        SQLiteDatabase db = getWritableDatabase();

        ContentValues row = new ContentValues();
        row.put("NAME", expenseList.getName());
        row.put("PRICE", expenseList.getPrice());
        row.put("DATE", expenseList.getDate());
        db.insert(TABLE_NAME, null, row);

        db.close();
    }

    public ExpenseList select(String name) {
        SQLiteDatabase db = getWritableDatabase();
        ExpenseList expensesList;

        Cursor cursor = db.query(TABLE_NAME, new String[]{"NAME", "PRICE", "DATE"},
                "NAME =?", new String[]{name},
                null, null, null
        );
        if (cursor.moveToFirst()) {
            name = cursor.getString(0);
            float price = cursor.getFloat(1);
            String date = cursor.getString(2);
            expensesList = new ExpenseList(name, price, date);

        } else
            expensesList = null;

        cursor.close();
        db.close();

        return expensesList;

    }

    public ExpenseList selectCost(Float price, Float priceTwo) {
        SQLiteDatabase db = getWritableDatabase();
        ExpenseList expenseList;


        Cursor cursor = db.query(TABLE_NAME, new String[]{"NAME", "PRICE", "DATE"},
                "NAME =?", new String[]{" BETWEEN " + price + " AND " + priceTwo},
                null, null, null
        );

        if (cursor.moveToFirst()) {
            String name = cursor.getString(0);
            price = cursor.getFloat(1);
            String date = cursor.getString(2);
            expenseList = new ExpenseList(name, price, date);

        } else
            expenseList = null;

        cursor.close();
        db.close();

        return expenseList;

    }

    public void delete(String place)
    {
        SQLiteDatabase db =getWritableDatabase();
        db.delete(TABLE_NAME, "NAME = ?", new String[]{place});
        db.close();
    }


    public LinkedList<ExpenseList> all()
    {
        SQLiteDatabase db = getWritableDatabase();

        LinkedList<ExpenseList> list = new LinkedList<ExpenseList>();

        Cursor cursor = db.query(TABLE_NAME, new String[]{"NAME", "PRICE", "DATE"}, null,null,null,null,null);

        while (cursor.moveToNext())
        {
            String name = cursor.getString(0);
            float price = cursor.getFloat(1);
            String date = cursor.getString(2);
            ExpenseList expenseList= new ExpenseList(name,price,date);
            list.addLast(expenseList);

        }
        cursor.close();
        db.close();

        return list;
    }

}


