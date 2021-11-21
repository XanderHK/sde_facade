package app;

public class HomeCinema {

    private final Amplifier amp;
    private final Tuner tuner;
    private final DvdPlayer dvd;
    private final CdPlayer cd;
    private final Projector projector;
    private final TheaterLights lights;
    private final Screen screen;
    private final PopcornPopper popper;

    public HomeCinema(Amplifier amp, Tuner tuner, DvdPlayer dvd, CdPlayer cd,  Projector projector, TheaterLights lights, Screen screen, PopcornPopper popper){
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(){
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play("Shawshank Redemption");
    }

    public void stopMovie(){
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }

    public void turnMusicOn(){
        lights.on();
        amp.on();
        amp.setVolume(5);
        amp.setCd(cd);
        amp.setStereoSound();
        cd.on();
        cd.play("Thriller");
    }

    public void turnMusicOff(){
        amp.off();
        amp.setCd(cd);
        cd.eject();
        cd.off();
    }

    public void turnRadioOn(){
        tuner.on();
        tuner.setFrequency(55.5);
        amp.on();
        amp.setVolume(5);
        amp.setTuner(tuner);
    }

    public void turnRadioOff(){
        tuner.off();
        amp.off();
    }
}
