package org.example;

public class Tamagochi {

    private StateTamgochi state;

    public  Tamagochi(){
        this.setState(new Sad(this));
    }

    private void state(Hungry hungry) {
    }

    public StateTamgochi getState() {
        return state;
    }

    public void setState(StateTamgochi state) {
        this.state = state;
    }

    public void eat(){
        getState().eat();
    };

    public void drink(){
        getState().drink();
    }

    public void kindness(){
        getState().kindness();
    }




}
