package com.global.vo;

/**
 * Linedetaile generated by MyEclipse Persistence Tools
 */

public class Linedetaile implements java.io.Serializable {

	// Fields

	private Integer linedetaileid;

	private Deliveryspot deliveryspot;

	private Line line;

	private Integer lineindex;

	// Constructors

	/** default constructor */
	public Linedetaile() {
	}

	/** full constructor */
	public Linedetaile(Deliveryspot deliveryspot, Line line, Integer lineindex) {
		this.deliveryspot = deliveryspot;
		this.line = line;
		this.lineindex = lineindex;
	}

	// Property accessors

	public Integer getLinedetaileid() {
		return this.linedetaileid;
	}

	public void setLinedetaileid(Integer linedetaileid) {
		this.linedetaileid = linedetaileid;
	}

	public Deliveryspot getDeliveryspot() {
		return this.deliveryspot;
	}

	public void setDeliveryspot(Deliveryspot deliveryspot) {
		this.deliveryspot = deliveryspot;
	}

	public Line getLine() {
		return this.line;
	}

	public void setLine(Line line) {
		this.line = line;
	}

	public Integer getLineindex() {
		return this.lineindex;
	}

	public void setLineindex(Integer lineindex) {
		this.lineindex = lineindex;
	}

}