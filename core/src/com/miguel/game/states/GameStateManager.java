package com.miguel.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.miguel.game.FlappyDemo;

import java.util.Stack;

/**
 * Created by Miguel on 31-Jan-16.
 */
public class GameStateManager {
    private Stack<State> states;


    public GameStateManager(){
        states = new Stack<State>();


    }

    public void push(State state){
        states.push(state);
    }

    public void pop(){
        states.pop().dispose();
    }

    public void set(State state){
        states.pop().dispose();
        states.push(state);
    }

    public void update(float dt){
        states.peek().update(dt);
    }

    public void render(SpriteBatch sb){
        states.peek().render(sb);
    }
}
