package com.example.ashwininadagoud.screensaver;

import java.util.Random;

public class Shapes {
    private double x1,x2,y1;
    private double birdY;
    int i;
    private double squarex1,squarey1,squarex2,squarey2;
    private double birdSpeed,x2Speed,squareSpeed1,sqSpeed2;
    private double radius,radius2,sqr1Length,sqLength2;
    private double x3,y3,x4,y4,radius4,x3Speed,x4speed,radius3;
    private double x5,y5,x6,y6,radius5,x5Speed,x6speed,radius6;
    private double x7,y7,x8,y8,radius7,x7Speed,x8speed,radius8;
    private double x9,y9,x10,y10,radius9,x9Speed,x10speed,radius10;
    private double squarex3,squarey3,squarex4,squarey4,squareSpeed4,squareSpeed3;
    private double squareLen3,squareLen4;
    private double squarex5,squarey5,squarex6,squarey6,squareSpeed5,squareSpeed6;
    private double squareLen5,squareLen6;
    private double squarex7,squarey7,squarex8,squarey8,squareSpeed7,squareSpeed8;
    private double squareLen7,squareLen8;
    private double squarex9,squarey9,squarex10,squarey10,squareSpeed9,squareSpeed10;
    private double squareLen9,squareLen10;
    double sceneWidth = 1800;
    double sceneHeight = 1100;

    public Shapes()
    {
        initializeGame1();
        initializeGame2();
        initializeGame3();
        initializeGame4();
        initializeGame5();
        initializeGame6();
        initializeGame7();
        initializeGame8();
        initializeGame9();
        initializeGame10();
        initializeGame11();
        initializeGame12();
        initializeGame13();
        initializeGame14();
        initializeGame15();
        initializeGame16();
        initializeGame17();
        initializeGame18();
        initializeGame19();
        initializeGame20();

    }
    public void update()
    {
        moveBird1();
        if(sceneClear1())
            initializeGame1();

        moveBird2();
        if(sceneClear2())
            initializeGame2();

        moveBird3();
        if(sceneClear3())
            initializeGame3();

        moveBird4();
        if(sceneClear4())
            initializeGame4();

        moveBird5();
        if(sceneClear5())
            initializeGame5();

        moveBird6();
        if(sceneClear6())
            initializeGame6();

        moveBird7();
        if(sceneClear7())
            initializeGame7();

        moveBird8();
        if(sceneClear8())
            initializeGame8();

        moveBird9();
        if(sceneClear9())
            initializeGame9();

        moveBird10();
        if(sceneClear10())
            initializeGame10();

        moveBird11();
        if(sceneClear11())
            initializeGame11();

        moveBird12();
        if(sceneClear12())
            initializeGame12();

        moveBird13();
        if(sceneClear13())
            initializeGame13();

        moveBird14();
        if(sceneClear14())
            initializeGame14();

        moveBird15();
        if(sceneClear15())
            initializeGame15();

        moveBird16();
        if(sceneClear16())
            initializeGame16();

        moveBird17();
        if(sceneClear17())
            initializeGame17();

        moveBird18();
        if(sceneClear18())
            initializeGame18();

        moveBird19();
        if(sceneClear19())
            initializeGame19();

        moveBird20();
        if(sceneClear20())
            initializeGame20();


    }

    public double getBirdX()
    {
        return x1;
    }
    public double getBirdY()
    {
        return birdY;
    }
    public double getSquarex1(){return squarex1;}
    public double getSquarey1(){return squarey1;}
    public double getSqr1Length(){return sqr1Length;}
    public double getSquarex2(){return squarex2;}
    public double getSquarey2(){return squarey2;}
    public double getSqr1Length2(){return sqLength2;}
    public double getx3(){return x3;}
    public double getY3(){return y3;}
    public double getRadius3(){return radius3;}
    public double getx4(){return x4;}
    public double getY4(){return y4;}
    public double getRadius4(){return radius4;}

    public double getx9(){return x9;}
    public double getY9(){return y9;}
    public double getRadius9(){return radius9;}
    public double getx10(){return x10;}
    public double getY10(){return y10;}
    public double getRadius10(){return radius10;}

    public double getSquarex3(){return squarex3;}
    public double getSquarex4(){return squarex4;}
    public double getSquarey3(){return squarey3;}
    public double getSquarey4(){return squarey4;}
    public double getSquareLen3(){return squareLen3;}
    public double getSquareLen4(){return squareLen4;}

    public double getSquarex5(){return squarex5;}
    public double getSquarex6(){return squarex6;}
    public double getSquarey5(){return squarey5;}
    public double getSquarey6(){return squarey6;}
    public double getSquareLen5(){return squareLen5;}
    public double getSquareLen6(){return squareLen6;}

    public double getSquarex7(){return squarex7;}
    public double getSquarex8(){return squarex8;}
    public double getSquarey7(){return squarey7;}
    public double getSquarey8(){return squarey8;}
    public double getSquareLen7(){return squareLen7;}
    public double getSquareLen8(){return squareLen8;}

    public double getSquarex9(){return squarex9;}
    public double getSquarex10(){return squarex10;}
    public double getSquarey9(){return squarey9;}
    public double getSquarey10(){return squarey10;}
    public double getSquareLen9(){return squareLen9;}
    public double getSquareLen10(){return squareLen10;}

    public double getx5(){return x5;}
    public double getY5(){return y5;}
    public double getRadius5(){return radius5;}
    public double getx6(){return x6;}
    public double getY6(){return y6;}
    public double getRadius6(){return radius6;}

    public double getx7(){return x7;}
    public double getY7(){return y7;}
    public double getRadius7(){return radius7;}
    public double getx8(){return x8;}
    public double getY8(){return y8;}
    public double getRadius8(){return radius8;}

    public double getRadius()
    {
        return radius;
    }
    public double getRadius2(){return radius2;}
    public double getx2(){return x2;}
    public double getY1(){return  y1;}


    private void moveBird1() {
        squarex1 = squarex1 - squareSpeed1;
    }
    private void moveBird2() {
        squarex2 = squarex2 - sqSpeed2;
    }
    private void moveBird3() {
        squarex3 = squarex3 - squareSpeed3;
    }
    private void moveBird4() {
        squarex4 = squarex4 - squareSpeed4;
    }
    private void moveBird5() {
        squarex5 = squarex5 + squareSpeed5;
    }
    private void moveBird6() {
        squarex6 = squarex6 + squareSpeed6;
    }
    private void moveBird7() {
        squarey7 = squarey7 + squareSpeed5;
    }
    private void moveBird8() {
        squarey8 = squarey8 + squareSpeed6;
    }
    private void moveBird9() {
        squarex9 = squarex9 + squareSpeed9;
    }
    private void moveBird10() {
        squarey10=squarey10+squareSpeed10;

    }

    private void moveBird11() {
        x1 = x1 - birdSpeed;
    }
    private void moveBird12() {
        y1 = y1 - x2Speed;
    }
    private void moveBird13() {

        x3 = x3 - x3Speed;
    }
    private void moveBird14() {
        x4 = x4 - x4speed;
    }
    private void moveBird15() {

        x5 = x5 + x5Speed;
    }
    private void moveBird16() {
        x6 = x6 + x6speed;
    }
    private void moveBird17() {
        y7 = y7 + x7Speed;
    }
    private void moveBird18() {
        y8 = y8 + x8speed;
    }

    private void moveBird19() {
        x9 = x9 - x9Speed;
    }
    private void moveBird20() {
        x10 = x10 - x10speed;
    }



    private boolean sceneClear1()
    {
        return (squarex1<0 || squarey1<0 );
    }
    private boolean sceneClear2()
    {
        return (squarex2<0 || squarey2<0 );
    }
    private boolean sceneClear3()
    {
        return (squarex3<0 || squarey3<0 );
    }
    private boolean sceneClear4()
    {
        return (squarex4<0 || squarey4<0 );
    }
    private boolean sceneClear5()
    {
        return (squarex5>1810 );
    }
    private boolean sceneClear6()
    {
        return (squarex6>1810);
    }
    private boolean sceneClear7()
    {
        return (squarey7>1020 );
    }
    private boolean sceneClear8()
    {
        return (squarey8>1020 );
    }
    private boolean sceneClear9()
    {
        return (squarex9>1810 );
    }
    private boolean sceneClear10()
    {
        return (squarey10>1020 );
    }
    private boolean sceneClear11()

    {
        return (x1<0 || birdY<0);
    }
    private boolean sceneClear12()
    {
        return (y1<0 || x2<0 );
    }
    private boolean sceneClear13()
    {
        return (y3<0 || x3<0);
    }
    private boolean sceneClear14()
    {
        return (y4<0 || x4<0);
    }
    private boolean sceneClear15()
    {
        return (x5>1810);
    }
    private boolean sceneClear16()
    {
        return (x6>1810 );
    }
    private boolean sceneClear17()
    {
        return (y7>1020 );
    }
    private boolean sceneClear18()
    {
        return (y8>1020);
    }
    private boolean sceneClear19()
    {
        return (x9<0 || y9<0 );
    }
    private boolean sceneClear20()
    {
        return (x10<0 || y10<0 );
    }

    public int randomPosRight(int i){
        Random randnum = new Random();
        i=randnum.nextInt(720)+128;
        return i;
    }
    public int randomPosTop(int i)
    {
        Random randnum = new Random();
        i=randnum.nextInt(1500)+128;
        return i;
    }
    public int randomRadius(int i)
    {
        Random randnum = new Random();
        i=randnum.nextInt(65)+50;
        return i;

    }
    public int randomSpeed(int i)
    {
        Random randnum = new Random();
        i=randnum.nextInt(10)+5;
        return i;
    }
    public int randomLengthSquare(int i)
    {
        Random randnum = new Random();
        i=randnum.nextInt(100)+75;
        return i;

    }

    int a=randomPosRight(i);
    int sq1Pos =randomPosRight(i);
    int b=randomPosRight(i);
    int r=randomRadius(i);
    int r1=randomRadius(i);
    int sq1Length1=randomLengthSquare(i);
    int s=randomSpeed(i);
    int sq1Speed=randomSpeed(i);
    int s1=randomSpeed(i);
    int sq2Pos=randomPosRight(i);
    int sq2Length=randomLengthSquare(i);
    int sq2Speed=randomSpeed(i);

    int sq3Pos=randomPosTop(i);
    int sq3Length=randomLengthSquare(i);
    int sq3Speed=randomSpeed(i);

    int sq5Pos=randomPosRight(i);
    int sq5Length=randomLengthSquare(i);
    int sq5Speed=randomSpeed(i);
    int sq6Pos=randomPosRight(i);
    int sq6Length=randomLengthSquare(i);
    int sq6Speed=randomSpeed(i);
    int sq9Pos=randomPosRight(i);
    int sq9Length=randomLengthSquare(i);
    int sq9Speed=randomSpeed(i);


    int sq7Pos=randomPosTop(i);
    int sq7Length=randomLengthSquare(i);
    int sq7Speed=randomSpeed(i);
    int sq8Pos=randomPosTop(i);
    int sq8Length=randomLengthSquare(i);
    int sq8Speed=randomSpeed(i);
    int sq10Pos=randomPosTop(i);
    int sq10Length=randomLengthSquare(i);
    int sq10Speed=randomSpeed(i);


    int sq4Pos=randomPosTop(i);
    int sq4Length=randomLengthSquare(i);
    int sq4Speed=randomSpeed(i);


    int x3Pos=randomPosTop(i);
    int x4Pos=randomPosTop(i);
    int x3rad=randomRadius(i);
    int x4rad=randomRadius(i);
    int x3Spe=randomSpeed(i);
    int x4Spe=randomSpeed(i);

    int x9Pos=randomPosTop(i);
    int x10Pos=randomPosTop(i);
    int x9rad=randomRadius(i);
    int x10rad=randomRadius(i);
    int x9Spe=randomSpeed(i);
    int x10Spe=randomSpeed(i);

    int x6Pos=randomPosRight(i);
    int x5Pos=randomPosRight(i);
    int x6rad=randomRadius(i);
    int x5rad=randomRadius(i);
    int x6Spe=randomSpeed(i);
    int x5Spe=randomSpeed(i);

    int x7Pos=randomPosTop(i);
    int x8Pos=randomPosTop(i);
    int x7rad=randomRadius(i);
    int x8rad=randomRadius(i);
    int x7Spe=randomSpeed(i);
    int x8Spe=randomSpeed(i);

    private void initializeGame1() {

        this.squarex1 = sceneWidth - 50;
        this.squarey1 = sq1Pos;
        this.squareSpeed1 = sq1Speed;
        this.sqr1Length = sq1Length1;
    }
    private void initializeGame2() {

        this.squarex2 = sceneWidth - 50;
        this.squarey2 = sq2Pos;
        this.sqSpeed2 = sq2Speed;
        this.sqLength2 = sq2Length;
    }

    private void initializeGame3() {
        this.squarex3 = sceneHeight - 50;
        this.squarey3 = sq3Pos;
        this.squareSpeed3 = sq3Speed;
        this.squareLen3 = sq3Length;
    }
    private void initializeGame4() {

        this.squarex4 = sceneHeight - 50;
        this.squarey4 = sq4Pos;
        this.squareSpeed4 = sq4Speed;
        this.squareLen4 = sq4Length;
    }
    private void initializeGame5() {

        this.squarex5 = 50;
        this.squarey5 = sq5Pos;
        this.squareSpeed5 = sq5Speed;
        this.squareLen5 = sq5Length;
    }
    private void initializeGame6() {

        this.squarex6 = 50;
        this.squarey6 = sq6Pos;
        this.squareSpeed6 = sq6Speed;
        this.squareLen6 = sq6Length;
    }
    private void initializeGame7() {

        this.squarex7 = sq7Pos;
        this.squarey7 = 50;
        this.squareSpeed7 = sq7Speed;
        this.squareLen7 = sq7Length;
    }
    private void initializeGame8() {

        this.squarex8 = sq8Pos;
        this.squarey8 = 50;
        this.squareSpeed8 = sq8Speed;
        this.squareLen8 = sq8Length;
    }
    private void initializeGame9() {

        this.squarex9 = 50;
        this.squarey9 = sq9Pos;
        this.squareSpeed9 = sq9Speed;
        this.squareLen9 = sq9Length;
    }
    private void initializeGame10() {

        this.squarex10 = sq10Pos;
        this.squarey10 = 50;
        this.squareSpeed10 = sq10Speed;
        this.squareLen10 = sq10Length;
    }
    private void initializeGame11() {


        this.x1 = sceneWidth - 50;
        this.birdY = a;
        this.birdSpeed = s;
        this.radius = r;
    }
    private void initializeGame12() {

        this.x2 = b;
        this.x2Speed = s1;
        this.radius2 = r1;
        this.y1 = sceneWidth - 50;
    }
    private void initializeGame13() {

        this.x3Speed = x3Spe;
        this.x3 = sceneHeight - 50;
        this.y3 = x3Pos;
        this.radius3 = x3rad;
    }
    private void initializeGame14() {

        this.x4speed = x4Spe;
        this.radius4 = x4rad;
        this.x4 = sceneHeight - 50;
        this.y4 = x4Pos;
    }
    private void initializeGame15() {

        this.x5Speed = x5Spe;
        this.x5 = 50;
        this.y5 = x5Pos;
        this.radius5 = x5rad;
    }
    private void initializeGame16() {

        this.x6speed = x6Spe;
        this.radius6 = x6rad;
        this.x6 = 50;
        this.y6 = x6Pos;
    }
    private void initializeGame17() {

        this.x7Speed = x7Spe;
        this.x7 = x7Pos;
        this.y7 = 50;
        this.radius7 = x7rad;
    }
    private void initializeGame18() {

        this.x8speed = x8Spe;
        this.radius8 = x8rad;
        this.x8 = x8Pos;
        this.y8 = 50;
    }
    private void initializeGame19() {

        this.x9Speed = x9Spe;
        this.x9 = sceneHeight - 50;
        this.y9 = x9Pos;
        this.radius9 = x9rad;
    }
    private void initializeGame20() {

        this.x10speed=x10Spe;
        this.radius10=x10rad;
        this.x10=sceneHeight-50;
        this.y10=x10Pos;


    }
}
