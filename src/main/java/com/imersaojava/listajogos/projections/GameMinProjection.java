package com.imersaojava.listajogos.projections;

public interface GameMinProjection {

	Long getId();
	String getTitle();
	Integer getGameYear();
	String getImgUrl();
	String getShortDescription();
	String getPosition();
}
