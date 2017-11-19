package org.sid.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Position {
	@Id @GeneratedValue
	private Long codeP;
	private Long x;
	private Long y;
	@ManyToOne
	@JoinColumn(name="CODE_PJ")
	private ParcJardin parcJardin;
	public Position() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Position( Long x, Long y, ParcJardin parcJardin) {
		super();
		
		this.x = x;
		this.y = y;
		this.parcJardin = parcJardin;
	}
	public Long getCodeP() {
		return codeP;
	}
	public void setCodeP(Long codeP) {
		this.codeP = codeP;
	}
	public Long getX() {
		return x;
	}
	public void setX(Long x) {
		this.x = x;
	}
	public Long getY() {
		return y;
	}
	public void setY(Long y) {
		this.y = y;
	}
	public ParcJardin getParcJardin() {
		return parcJardin;
	}
	public void setParcJardin(ParcJardin parcJardin) {
		this.parcJardin = parcJardin;
	}
	
}
