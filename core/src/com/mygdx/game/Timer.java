package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Timer {
    private BitmapFont font;
    private float deltaTime = 0;
    private boolean stopped;
    String time = "0";

    public Timer() {
        font = new BitmapFont();
        stopped = false;
    }

    public void update(){
        if (!this.stopped) {
            deltaTime += (Gdx.graphics.getDeltaTime());
            time = String.format("%.0f", deltaTime);
        }
    }

    public void stop(){
        this.stopped = true;
    }

    public void start(){
        this.stopped = false;
    }

    public void drawTime(SpriteBatch batch) {
        font.draw(batch, time, 50, 30);
    }

}
