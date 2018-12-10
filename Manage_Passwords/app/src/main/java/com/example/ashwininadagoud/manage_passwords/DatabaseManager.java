package com.example.ashwininadagoud.manage_passwords;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.LinkedList;

public class DatabaseManager extends SQLiteOpenHelper {

    //To create the database
    private static final String DATABASE_NAME = "MANAGE_PASSWORDS";
    private static final int DATABASE_VERSION=1;
    private static final String TABLE_NAME = "PASSWORDS_TABLE";

    public DatabaseManager(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    //To create columns
    public void onCreate(SQLiteDatabase db)
    {
        String command = "create table " + TABLE_NAME + "(" +
                "_ID integer primary key autoincrement, " +
                "ACCOUNT text, " + "PASSWORD text)";
        db.execSQL(command);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }

    //Insert query
    public void insert(ManagePasswords managePasswords)
    {
        SQLiteDatabase db = getWritableDatabase();

        ContentValues row = new ContentValues();
        row.put("ACCOUNT", managePasswords.getAccount());
        row.put("PASSWORD", managePasswords.getPassword());
        db.insert(TABLE_NAME, null, row);

        db.close();
    }

    //Delete query
    public void delete(String account)
    {
        SQLiteDatabase db =getWritableDatabase();
        db.delete(TABLE_NAME, "ACCOUNT = ?", new String[]{account});
        db.close();
    }

    //Update query
    public void update(ManagePasswords managePasswords)
    {
        SQLiteDatabase db = getWritableDatabase();

        ContentValues row = new ContentValues();
        row.put("ACCOUNT", managePasswords.getAccount());
        row.put("PASSWORD", managePasswords.getPassword());
        db.update(TABLE_NAME, row, "ACCOUNT = ?", new String[]{managePasswords.getAccount()});
        db.close();
    }

    //Linked list to hold the data entered
    public LinkedList<ManagePasswords> all()
    {
        SQLiteDatabase db = getWritableDatabase();

        LinkedList<ManagePasswords> list = new LinkedList<ManagePasswords>();

        Cursor cursor = db.query(TABLE_NAME, new String[]{"ACCOUNT", "PASSWORD"}, null,null,null,null,null);

        while (cursor.moveToNext())
        {
            String account = cursor.getString(0);
            String password = cursor.getString(1);
            ManagePasswords managePasswords= new ManagePasswords(account,password);
            list.addLast(managePasswords);
        }
        cursor.close();
        db.close();

        return list;
    }
}
