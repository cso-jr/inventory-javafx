package model.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Estoque implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String barras;
	private String codigo;
	private String descricao;
	private Integer categoria;
	private Integer qtde;
	private Integer qtdemin; 
	private Double acrescimo;
	private Double precoc;
	private Double precov;
	private String familia;
	private String catalogo;
	private String pu;
	private String validade;
	private String unidade;
	private String marca;
	private Integer fornece1;
	private Integer fornece2;
	private Integer fornece3;
	private String local;
	private Character promocao;
	private Double proMin;
	private Double valorpro;
	private String fabricante;
	private Double comissao;
	private LocalDate datapro;
	private Integer aliquota;
	private Integer qtdetipo;
	private String alteracao;
	private String obs;
	private String aplicacao;
	private Integer grupo;
	private Integer subgrupo;
	private Integer st;
	private Integer tamanho;
	private Integer sexo;
	private Integer cor;
	private Integer modelo;
	private String referencia;
	private String xsubgrupo;
	private String xreferencia;
	private String xtamanho;
	private String xgrupo;
	private String cst;
	private Double precotipo;
	private Double qtdedotipo;
	private String barrastipo;
	private String destaque;
	private LocalDate dataproini;
	private String descatacado;
	private LocalDate dataAlteracao;
	private String mascQtd;
	private Integer ipi;
	private String icmsBcMod;
	private String icmsBcStMod;
	private String pis;
	private String codCofins;
	private String ipiSit;
	private String csosn;
	private String cfop;
	private Integer origem;
	private Double icms;
	private Double icmsAliq;
	private Double icmsAliqSt;
	private Double icmsPmvast;
	private Double icmsReducao;
	private Double icmsReducaoSt;
	private String ncm;
	private Double aliqCofins;
	private Double aliqCofinsValor;
	private Double aliqIcms;
	private Double aliqPis;
	private Double aliqPisValor;
	private String cfopEDentrouf;
	private String cfopEForauf;
	private Double precov1;
	private Double precov2;
	private String impressora;
	private String cest;
	private String nomereduzido;
	private String aplicacao2;
	private String aplicacao3;
	private String enviado;

	
	public Estoque() {
		
	}
	
	public Estoque(Integer id, String codigo, String barras, String descricao, Integer qtde, String unidade, Double precov, String local) {
		this.id = id;
		this.codigo = codigo;
		this.barras = barras;
		this.descricao = descricao;
		this.qtde = qtde;
		this.unidade = unidade;
		this.precov = precov;
		this.local = local;
		
	}


	public Estoque(Integer id, String barras, String codigo, String descricao, Integer categoria, Integer qtde,
			Integer qtdemin, Double acrescimo, Double precoc, Double precov, String familia, String catalogo, String pu,
			String validade, String unidade, String marca, Integer fornece1, Integer fornece2, Integer fornece3,
			String local, Character promocao, Double proMin, Double valorpro, String fabricante, Double comissao,
			LocalDate datapro, Integer aliquota, Integer qtdetipo, String alteracao, String obs, String aplicacao,
			Integer grupo, Integer subgrupo, Integer st, Integer tamanho, Integer sexo, Integer cor, Integer modelo,
			String referencia, String xsubgrupo, String xreferencia, String xtamanho, String xgrupo, String cst,
			Double precotipo, Double qtdedotipo, String barrastipo, String destaque, LocalDate dataproini,
			String descatacado, LocalDate dataAlteracao, String mascQtd, Integer ipi, String icmsBcMod,
			String icmsBcStMod, String pis, String codCofins, String ipiSit, String csosn, String cfop, Integer origem,
			Double icms, Double icmsAliq, Double icmsAliqSt, Double icmsPmvast, Double icmsReducao,
			Double icmsReducaoSt, String ncm, Double aliqCofins, Double aliqCofinsValor, Double aliqIcms,
			Double aliqPis, Double aliqPisValor, String cfopEDentrouf, String cfopEForauf, Double precov1,
			Double precov2, String impressora, String cest, String nomereduzido, String aplicacao2, String aplicacao3,
			String enviado) {
		super();
		this.id = id;
		this.barras = barras;
		this.codigo = codigo;
		this.descricao = descricao;
		this.categoria = categoria;
		this.qtde = qtde;
		this.qtdemin = qtdemin;
		this.acrescimo = acrescimo;
		this.precoc = precoc;
		this.precov = precov;
		this.familia = familia;
		this.catalogo = catalogo;
		this.pu = pu;
		this.validade = validade;
		this.unidade = unidade;
		this.marca = marca;
		this.fornece1 = fornece1;
		this.fornece2 = fornece2;
		this.fornece3 = fornece3;
		this.local = local;
		this.promocao = promocao;
		this.proMin = proMin;
		this.valorpro = valorpro;
		this.fabricante = fabricante;
		this.comissao = comissao;
		this.datapro = datapro;
		this.aliquota = aliquota;
		this.qtdetipo = qtdetipo;
		this.alteracao = alteracao;
		this.obs = obs;
		this.aplicacao = aplicacao;
		this.grupo = grupo;
		this.subgrupo = subgrupo;
		this.st = st;
		this.tamanho = tamanho;
		this.sexo = sexo;
		this.cor = cor;
		this.modelo = modelo;
		this.referencia = referencia;
		this.xsubgrupo = xsubgrupo;
		this.xreferencia = xreferencia;
		this.xtamanho = xtamanho;
		this.xgrupo = xgrupo;
		this.cst = cst;
		this.precotipo = precotipo;
		this.qtdedotipo = qtdedotipo;
		this.barrastipo = barrastipo;
		this.destaque = destaque;
		this.dataproini = dataproini;
		this.descatacado = descatacado;
		this.dataAlteracao = dataAlteracao;
		this.mascQtd = mascQtd;
		this.ipi = ipi;
		this.icmsBcMod = icmsBcMod;
		this.icmsBcStMod = icmsBcStMod;
		this.pis = pis;
		this.codCofins = codCofins;
		this.ipiSit = ipiSit;
		this.csosn = csosn;
		this.cfop = cfop;
		this.origem = origem;
		this.icms = icms;
		this.icmsAliq = icmsAliq;
		this.icmsAliqSt = icmsAliqSt;
		this.icmsPmvast = icmsPmvast;
		this.icmsReducao = icmsReducao;
		this.icmsReducaoSt = icmsReducaoSt;
		this.ncm = ncm;
		this.aliqCofins = aliqCofins;
		this.aliqCofinsValor = aliqCofinsValor;
		this.aliqIcms = aliqIcms;
		this.aliqPis = aliqPis;
		this.aliqPisValor = aliqPisValor;
		this.cfopEDentrouf = cfopEDentrouf;
		this.cfopEForauf = cfopEForauf;
		this.precov1 = precov1;
		this.precov2 = precov2;
		this.impressora = impressora;
		this.cest = cest;
		this.nomereduzido = nomereduzido;
		this.aplicacao2 = aplicacao2;
		this.aplicacao3 = aplicacao3;
		this.enviado = enviado;
	}



	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getBarras() {
		return barras;
	}


	public void setBarras(String barras) {
		this.barras = barras;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Integer getCategoria() {
		return categoria;
	}


	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}


	public Integer getQtde() {
		return qtde;
	}


	public void setQtde(Integer qtde) {
		this.qtde = qtde;
	}


	public Integer getQtdemin() {
		return qtdemin;
	}


	public void setQtdemin(Integer qtdemin) {
		this.qtdemin = qtdemin;
	}


	public Double getAcrescimo() {
		return acrescimo;
	}


	public void setAcrescimo(Double acrescimo) {
		this.acrescimo = acrescimo;
	}


	public Double getPrecoc() {
		return precoc;
	}


	public void setPrecoc(Double precoc) {
		this.precoc = precoc;
	}


	public Double getPrecov() {
		return precov;
	}


	public void setPrecov(Double precov) {
		this.precov = precov;
	}


	public String getFamilia() {
		return familia;
	}


	public void setFamilia(String familia) {
		this.familia = familia;
	}


	public String getCatalogo() {
		return catalogo;
	}


	public void setCatalogo(String catalogo) {
		this.catalogo = catalogo;
	}


	public String getPu() {
		return pu;
	}


	public void setPu(String pu) {
		this.pu = pu;
	}


	public String getValidade() {
		return validade;
	}


	public void setValidade(String validade) {
		this.validade = validade;
	}


	public String getUnidade() {
		return unidade;
	}


	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public Integer getFornece1() {
		return fornece1;
	}


	public void setFornece1(Integer fornece1) {
		this.fornece1 = fornece1;
	}


	public Integer getFornece2() {
		return fornece2;
	}


	public void setFornece2(Integer fornece2) {
		this.fornece2 = fornece2;
	}


	public Integer getFornece3() {
		return fornece3;
	}


	public void setFornece3(Integer fornece3) {
		this.fornece3 = fornece3;
	}


	public String getLocal() {
		return local;
	}


	public void setLocal(String local) {
		this.local = local;
	}


	public Character getPromocao() {
		return promocao;
	}


	public void setPromocao(Character promocao) {
		this.promocao = promocao;
	}


	public Double getProMin() {
		return proMin;
	}


	public void setProMin(Double proMin) {
		this.proMin = proMin;
	}


	public Double getValorpro() {
		return valorpro;
	}


	public void setValorpro(Double valorpro) {
		this.valorpro = valorpro;
	}


	public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	public Double getComissao() {
		return comissao;
	}


	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}


	public LocalDate getDatapro() {
		return datapro;
	}


	public void setDatapro(LocalDate datapro) {
		this.datapro = datapro;
	}


	public Integer getAliquota() {
		return aliquota;
	}


	public void setAliquota(Integer aliquota) {
		this.aliquota = aliquota;
	}


	public Integer getQtdetipo() {
		return qtdetipo;
	}


	public void setQtdetipo(Integer qtdetipo) {
		this.qtdetipo = qtdetipo;
	}


	public String getAlteracao() {
		return alteracao;
	}


	public void setAlteracao(String alteracao) {
		this.alteracao = alteracao;
	}


	public String getObs() {
		return obs;
	}


	public void setObs(String obs) {
		this.obs = obs;
	}


	public String getAplicacao() {
		return aplicacao;
	}


	public void setAplicacao(String aplicacao) {
		this.aplicacao = aplicacao;
	}


	public Integer getGrupo() {
		return grupo;
	}


	public void setGrupo(Integer grupo) {
		this.grupo = grupo;
	}


	public Integer getSubgrupo() {
		return subgrupo;
	}


	public void setSubgrupo(Integer subgrupo) {
		this.subgrupo = subgrupo;
	}


	public Integer getSt() {
		return st;
	}


	public void setSt(Integer st) {
		this.st = st;
	}


	public Integer getTamanho() {
		return tamanho;
	}


	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}


	public Integer getSexo() {
		return sexo;
	}


	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}


	public Integer getCor() {
		return cor;
	}


	public void setCor(Integer cor) {
		this.cor = cor;
	}


	public Integer getModelo() {
		return modelo;
	}


	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}


	public String getReferencia() {
		return referencia;
	}


	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}


	public String getXsubgrupo() {
		return xsubgrupo;
	}


	public void setXsubgrupo(String xsubgrupo) {
		this.xsubgrupo = xsubgrupo;
	}


	public String getXreferencia() {
		return xreferencia;
	}


	public void setXreferencia(String xreferencia) {
		this.xreferencia = xreferencia;
	}


	public String getXtamanho() {
		return xtamanho;
	}


	public void setXtamanho(String xtamanho) {
		this.xtamanho = xtamanho;
	}


	public String getXgrupo() {
		return xgrupo;
	}


	public void setXgrupo(String xgrupo) {
		this.xgrupo = xgrupo;
	}


	public String getCst() {
		return cst;
	}


	public void setCst(String cst) {
		this.cst = cst;
	}


	public Double getPrecotipo() {
		return precotipo;
	}


	public void setPrecotipo(Double precotipo) {
		this.precotipo = precotipo;
	}


	public Double getQtdedotipo() {
		return qtdedotipo;
	}


	public void setQtdedotipo(Double qtdedotipo) {
		this.qtdedotipo = qtdedotipo;
	}


	public String getBarrastipo() {
		return barrastipo;
	}


	public void setBarrastipo(String barrastipo) {
		this.barrastipo = barrastipo;
	}


	public String getDestaque() {
		return destaque;
	}


	public void setDestaque(String destaque) {
		this.destaque = destaque;
	}


	public LocalDate getDataproini() {
		return dataproini;
	}


	public void setDataproini(LocalDate dataproini) {
		this.dataproini = dataproini;
	}


	public String getDescatacado() {
		return descatacado;
	}


	public void setDescatacado(String descatacado) {
		this.descatacado = descatacado;
	}


	public LocalDate getDataAlteracao() {
		return dataAlteracao;
	}


	public void setDataAlteracao(LocalDate dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}


	public String getMascQtd() {
		return mascQtd;
	}


	public void setMascQtd(String mascQtd) {
		this.mascQtd = mascQtd;
	}


	public Integer getIpi() {
		return ipi;
	}


	public void setIpi(Integer ipi) {
		this.ipi = ipi;
	}


	public String getIcmsBcMod() {
		return icmsBcMod;
	}


	public void setIcmsBcMod(String icmsBcMod) {
		this.icmsBcMod = icmsBcMod;
	}


	public String getIcmsBcStMod() {
		return icmsBcStMod;
	}


	public void setIcmsBcStMod(String icmsBcStMod) {
		this.icmsBcStMod = icmsBcStMod;
	}


	public String getPis() {
		return pis;
	}


	public void setPis(String pis) {
		this.pis = pis;
	}


	public String getCodCofins() {
		return codCofins;
	}


	public void setCodCofins(String codCofins) {
		this.codCofins = codCofins;
	}


	public String getIpiSit() {
		return ipiSit;
	}


	public void setIpiSit(String ipiSit) {
		this.ipiSit = ipiSit;
	}


	public String getCsosn() {
		return csosn;
	}


	public void setCsosn(String csosn) {
		this.csosn = csosn;
	}


	public String getCfop() {
		return cfop;
	}


	public void setCfop(String cfop) {
		this.cfop = cfop;
	}


	public Integer getOrigem() {
		return origem;
	}


	public void setOrigem(Integer origem) {
		this.origem = origem;
	}


	public Double getIcms() {
		return icms;
	}


	public void setIcms(Double icms) {
		this.icms = icms;
	}


	public Double getIcmsAliq() {
		return icmsAliq;
	}


	public void setIcmsAliq(Double icmsAliq) {
		this.icmsAliq = icmsAliq;
	}


	public Double getIcmsAliqSt() {
		return icmsAliqSt;
	}


	public void setIcmsAliqSt(Double icmsAliqSt) {
		this.icmsAliqSt = icmsAliqSt;
	}


	public Double getIcmsPmvast() {
		return icmsPmvast;
	}


	public void setIcmsPmvast(Double icmsPmvast) {
		this.icmsPmvast = icmsPmvast;
	}


	public Double getIcmsReducao() {
		return icmsReducao;
	}


	public void setIcmsReducao(Double icmsReducao) {
		this.icmsReducao = icmsReducao;
	}


	public Double getIcmsReducaoSt() {
		return icmsReducaoSt;
	}


	public void setIcmsReducaoSt(Double icmsReducaoSt) {
		this.icmsReducaoSt = icmsReducaoSt;
	}


	public String getNcm() {
		return ncm;
	}


	public void setNcm(String ncm) {
		this.ncm = ncm;
	}


	public Double getAliqCofins() {
		return aliqCofins;
	}


	public void setAliqCofins(Double aliqCofins) {
		this.aliqCofins = aliqCofins;
	}


	public Double getAliqCofinsValor() {
		return aliqCofinsValor;
	}


	public void setAliqCofinsValor(Double aliqCofinsValor) {
		this.aliqCofinsValor = aliqCofinsValor;
	}


	public Double getAliqIcms() {
		return aliqIcms;
	}


	public void setAliqIcms(Double aliqIcms) {
		this.aliqIcms = aliqIcms;
	}


	public Double getAliqPis() {
		return aliqPis;
	}


	public void setAliqPis(Double aliqPis) {
		this.aliqPis = aliqPis;
	}


	public Double getAliqPisValor() {
		return aliqPisValor;
	}


	public void setAliqPisValor(Double aliqPisValor) {
		this.aliqPisValor = aliqPisValor;
	}


	public String getCfopEDentrouf() {
		return cfopEDentrouf;
	}


	public void setCfopEDentrouf(String cfopEDentrouf) {
		this.cfopEDentrouf = cfopEDentrouf;
	}


	public String getCfopEForauf() {
		return cfopEForauf;
	}


	public void setCfopEForauf(String cfopEForauf) {
		this.cfopEForauf = cfopEForauf;
	}


	public Double getPrecov1() {
		return precov1;
	}


	public void setPrecov1(Double precov1) {
		this.precov1 = precov1;
	}


	public Double getPrecov2() {
		return precov2;
	}


	public void setPrecov2(Double precov2) {
		this.precov2 = precov2;
	}


	public String getImpressora() {
		return impressora;
	}


	public void setImpressora(String impressora) {
		this.impressora = impressora;
	}


	public String getCest() {
		return cest;
	}


	public void setCest(String cest) {
		this.cest = cest;
	}


	public String getNomereduzido() {
		return nomereduzido;
	}


	public void setNomereduzido(String nomereduzido) {
		this.nomereduzido = nomereduzido;
	}


	public String getAplicacao2() {
		return aplicacao2;
	}


	public void setAplicacao2(String aplicacao2) {
		this.aplicacao2 = aplicacao2;
	}


	public String getAplicacao3() {
		return aplicacao3;
	}


	public void setAplicacao3(String aplicacao3) {
		this.aplicacao3 = aplicacao3;
	}


	public String getEnviado() {
		return enviado;
	}


	public void setEnviado(String enviado) {
		this.enviado = enviado;
	}


	@Override
	public int hashCode() {
		return Objects.hash(descricao, id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estoque other = (Estoque) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(id, other.id);
	}


	@Override
	public String toString() {
		return "Estoque [id=" + id + ", barras=" + barras + ", codigo=" + codigo + ", descricao=" + descricao
				+ ", categoria=" + categoria + ", qtde=" + qtde + ", qtdemin=" + qtdemin + ", acrescimo=" + acrescimo
				+ ", precoc=" + precoc + ", precov=" + precov + ", familia=" + familia + ", catalogo=" + catalogo
				+ ", pu=" + pu + ", validade=" + validade + ", unidade=" + unidade + ", marca=" + marca + ", fornece1="
				+ fornece1 + ", fornece2=" + fornece2 + ", fornece3=" + fornece3 + ", local=" + local + ", promocao="
				+ promocao + ", proMin=" + proMin + ", valorpro=" + valorpro + ", fabricante=" + fabricante
				+ ", comissao=" + comissao + ", datapro=" + datapro + ", aliquota=" + aliquota + ", qtdetipo="
				+ qtdetipo + ", alteracao=" + alteracao + ", obs=" + obs + ", aplicacao=" + aplicacao + ", grupo="
				+ grupo + ", subgrupo=" + subgrupo + ", st=" + st + ", tamanho=" + tamanho + ", sexo=" + sexo + ", cor="
				+ cor + ", modelo=" + modelo + ", referencia=" + referencia + ", xsubgrupo=" + xsubgrupo
				+ ", xreferencia=" + xreferencia + ", xtamanho=" + xtamanho + ", xgrupo=" + xgrupo + ", cst=" + cst
				+ ", precotipo=" + precotipo + ", qtdedotipo=" + qtdedotipo + ", barrastipo=" + barrastipo
				+ ", destaque=" + destaque + ", dataproini=" + dataproini + ", descatacado=" + descatacado
				+ ", dataAlteracao=" + dataAlteracao + ", mascQtd=" + mascQtd + ", ipi=" + ipi + ", icmsBcMod="
				+ icmsBcMod + ", icmsBcStMod=" + icmsBcStMod + ", pis=" + pis + ", codCofins=" + codCofins + ", ipiSit="
				+ ipiSit + ", csosn=" + csosn + ", cfop=" + cfop + ", origem=" + origem + ", icms=" + icms
				+ ", icmsAliq=" + icmsAliq + ", icmsAliqSt=" + icmsAliqSt + ", icmsPmvast=" + icmsPmvast
				+ ", icmsReducao=" + icmsReducao + ", icmsReducaoSt=" + icmsReducaoSt + ", ncm=" + ncm + ", aliqCofins="
				+ aliqCofins + ", aliqCofinsValor=" + aliqCofinsValor + ", aliqIcms=" + aliqIcms + ", aliqPis="
				+ aliqPis + ", aliqPisValor=" + aliqPisValor + ", cfopEDentrouf=" + cfopEDentrouf + ", cfopEForauf="
				+ cfopEForauf + ", precov1=" + precov1 + ", precov2=" + precov2 + ", impressora=" + impressora
				+ ", cest=" + cest + ", nomereduzido=" + nomereduzido + ", aplicacao2=" + aplicacao2 + ", aplicacao3="
				+ aplicacao3 + ", enviado=" + enviado + "]";
	}
	
	

}
