package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import contract.IObserver;
import entity.Element;

/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
class ViewPanel extends JPanel implements IObserver {

	/** The view frame. */
	private ViewFrame					viewFrame;
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;

	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 */
	public ViewPanel(final ViewFrame viewFrame) {
		this.setViewFrame(viewFrame);
		this.viewFrame.getModel().setObserver(this);
		//viewFrame.getModel().getObservable().addObserver(this);
	}

	/**
	 * Gets the view frame.
	 *
	 * @return the view frame
	 */
	private ViewFrame getViewFrame() {
		return this.viewFrame;
	}

	/**
	 * Sets the view frame.
	 *
	 * @param viewFrame
	 *          the new view frame
	 */
	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)sss
	 */
	@Override
	protected void paintComponent(final Graphics graphics) {
		
		for(int i=0; i<this.viewFrame.getModel().getMap().getHeight(); i++) {
			for(int j=0; j<this.viewFrame.getModel().getMap().getWidth(); j++) {
				graphics.drawImage(this.viewFrame.getModel().getMap().getElement(j, i).getActualSprite(), j*ViewFrame.squaresize, i*ViewFrame.squaresize, null);
			}
		}
		
		
		graphics.drawImage(this.viewFrame.getModel().getPlayer().getActualSprite(), this.viewFrame.getModel().getPlayer().getX()*ViewFrame.squaresize, this.viewFrame.getModel().getPlayer().getY()*ViewFrame.squaresize, null);
		//graphics.drawString(this.getViewFrame().getModel().getHelloWorld().getMessage(),10, 20);
		Font aria = new Font("Aria", 10, 50);
		graphics.setFont(aria);
		graphics.setColor(Color.white);
		graphics.drawString("Score:" + String.valueOf(this.viewFrame.getModel().getScore()), 10, 30);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		this.repaint();
	}
}
