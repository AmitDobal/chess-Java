package com.designpattern.strategy.example3.imagerenderer.renderer;

import com.designpattern.strategy.example3.imagerenderer.startegy.RendererStrategy;

public class TVRenderer implements RendererStrategy {

	@Override
	public void showImage() {
		System.out.println("Showing an image on TV...");
	}

}
