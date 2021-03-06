package main.java.controllers;

import main.java.views.DJView;
import main.java.models.BeatModelInterface;

public class BeatController implements ControllerInterface {
	BeatModelInterface model;
	DJView view;

	public BeatController(BeatModelInterface model,DJView view) {
		this.model = model;
		this.view = view;
		view.disableStopMenuItem();
		view.enableStartMenuItem();
		view.disableDJStartMenuItem();
		view.disableHeartStartMenuItem();
		view.disableMP3StartMenuItem();
		model.initialize();
	}

	public void start() {
		model.on();
		view.disableStartMenuItem();
		view.enableStopMenuItem();
	}

	public void stop() {
		model.off();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
	}

	public void increaseBPM() {
		int bpm = model.getBPM();
		model.setBPM(bpm + 1);
	}

	public void decreaseBPM() {
		int bpm = model.getBPM();
		model.setBPM(bpm - 1);
	}

	public void setBPM(int bpm) {
		model.setBPM(bpm);
	}
}
