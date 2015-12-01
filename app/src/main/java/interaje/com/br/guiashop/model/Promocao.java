package interaje.com.br.guiashop.model;

import java.security.Timestamp;
import java.util.Date;

/**
 * Created by Bruno on 20/11/2015.
 */
public class Promocao {
    private Long id;
    private Long idBox;
    private Date dataInicio;
    private Date dataFim;
    private Timestamp dataHoraCadastro;
    private Boolean status;
    private String descricao;
    private String imgPath;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdBox() {
        return idBox;
    }

    public void setIdBox(Long idBox) {
        this.idBox = idBox;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Timestamp getDataHoraCadastro() {
        return dataHoraCadastro;
    }

    public void setDataHoraCadastro(Timestamp dataHoraCadastro) {
        this.dataHoraCadastro = dataHoraCadastro;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
}
