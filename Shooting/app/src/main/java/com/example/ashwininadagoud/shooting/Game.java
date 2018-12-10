package com.example.ashwininadagoud.shooting;

public class Game {
    private double birdX;
    private double birdY;
    private double birdSpeed;

    private double bulletX;
    private double bulletY;
    private double bulletSpeed;
    private double bulletAngle;

    private double gunX;
    private double gunY;
    private double scenegun;

    String color="#009900";

    private double radius;
    private double distanceThreshold;

    private boolean fired;
    private boolean hit;

    public Game()
    {
        initializeGame();
    }
    public void update()
    {
        moveBird();

        if(fired)
            moveBullet();

        if(sceneClear())
            initializeGame();

    }
    public void fire()
    {
        fired=true;
    }
    public double getBirdX()
    {
        return birdX;
    }
    public double getBirdY()
    {
        return birdY;
    }
    public double getBulletX()
    {
        return bulletX;
    }
    public double getBulletY()
    {
        return bulletY;
    }
    public double getGunX()
    {
        return gunX;
    }
    public double getGunY()
    {
        return gunY;
    }
    public double getRadius()
    {
        return radius;
    }
    public double getScenegun()
    {
        return scenegun;
    }
    public String getColor(){return color;}

    private void moveBird()
    {
        if(!hit)
        {
            birdY= birdY-birdSpeed;
            hit = decideHit();
        }
        else {

            color="#D6EAF8";
            birdY=birdY-birdSpeed;

        }
    }

    private void moveBullet()
    {
        bulletX = bulletX + bulletSpeed*Math.cos(bulletAngle*Math.PI/180);
        bulletY = bulletY+ bulletSpeed*Math.sin(bulletAngle*Math.PI/180);

    }
    private boolean decideHit()
    {
        double distance = Math.sqrt((birdX-bulletX)*(birdX-bulletX)+(birdY-bulletY)*(birdY-bulletY) );
        return distance<=distanceThreshold;
    }
    private boolean sceneClear()
    {
        return (birdX<0 || birdY<0)&&bulletY>1000;
    }
    private void initializeGame()
    {

        double sceneHeight=1000;
        double gunLength=200;
        double gunAngle = 20 + 25 * Math.random();

        this.birdX = 600 + 400*Math.random();
        this.birdY = sceneHeight-50;
        this.birdSpeed = 5 + 5 * Math.random();

        this.gunX = gunLength*Math.cos(gunAngle*Math.PI/180);
        this.gunY = gunLength*Math.sin(gunAngle*Math.PI/180);
        this.scenegun=600+450*Math.random();

        this.bulletX=gunX;
        this.bulletY=gunY;
        this.bulletSpeed=20;
        this.bulletAngle=gunAngle;


        this.color="#0E6655";

        this.radius=50;

        this.distanceThreshold=100;

        this.fired=false;
        this.hit=false;
    }

}
