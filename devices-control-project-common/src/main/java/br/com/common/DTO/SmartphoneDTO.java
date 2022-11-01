package br.com.common.DTO;

import java.util.Date;

public class SmartphoneDTO {
	private Long id;
	private String modelo;
	private String chapa;
	private String imei;
	private String mac;
	private StatusDTO status;
	private UsuarioDTO usuario;
	private Date dataCadastro;
	
	public SmartphoneDTO() {
	}

	public SmartphoneDTO(String modelo, String chapa, String imei, String mac, StatusDTO status, UsuarioDTO usuario,
			Date dataCadastro) {
		this.modelo = modelo;
		this.chapa = chapa;
		this.imei = imei;
		this.mac = mac;
		this.status = status;
		this.usuario = usuario;
		this.dataCadastro = dataCadastro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getChapa() {
		return chapa;
	}

	public void setChapa(String chapa) {
		this.chapa = chapa;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public StatusDTO getStatus() {
		return status;
	}

	public void setStatus(StatusDTO status) {
		this.status = status;
	}

	public UsuarioDTO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	
	
}
