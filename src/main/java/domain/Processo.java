package domain;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "TB_PROCESSO", uniqueConstraints = @UniqueConstraint(columnNames = "NR_PROCESSO"))
public class Processo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PROCESSO")
    @SequenceGenerator(name = "SQ_PROCESSO", sequenceName = "SQ_PROCESSO")
    private long id;

    @Column(name = "NR_PROCESSO")
    private String numero;

    @Column(name = "DT_DISTRIBUICAO_PROCESSO")
    private LocalDate dataDeDistribuicao;

    @Column(name = "TP_ACAO_PROCESSO")
    private TipoDeAcao tipoDeAcao;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @JoinColumn(name = "ID_TB_PROCESSO", referencedColumnName = "ID_TB_PROCESSO",
            foreignKey = @ForeignKey(name = "FK_ID_PROCESSO"))
    private Advogado advogado;

    private boolean proBono;


    public Processo() {
    }

    public Processo(long id, String numero, LocalDate dataDeDistribuicao, TipoDeAcao tipoDeAcao, Advogado advogado, boolean proBono) {
        this.id = id;
        this.numero = numero;
        this.dataDeDistribuicao = dataDeDistribuicao;
        this.tipoDeAcao = tipoDeAcao;
        this.advogado = advogado;
        this.proBono = proBono;
    }

    public long getId() {
        return id;
    }

    public Processo setId(long id) {
        this.id = id;
        return this;
    }

    public String getNumero() {
        return numero;
    }

    public Processo setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public LocalDate getDataDeDistribuicao() {
        return dataDeDistribuicao;
    }

    public Processo setDataDeDistribuicao(LocalDate dataDeDistribuicao) {
        this.dataDeDistribuicao = dataDeDistribuicao;
        return this;
    }

    public TipoDeAcao getTipoDeAcao() {
        return tipoDeAcao;
    }

    public Processo setTipoDeAcao(TipoDeAcao tipoDeAcao) {
        this.tipoDeAcao = tipoDeAcao;
        return this;
    }

    public Advogado getAdvogado() {
        return advogado;
    }

    public Processo setAdvogado(Advogado advogado) {
        this.advogado = advogado;
        return this;
    }

    public boolean isProBono() {
        return proBono;
    }

    public Processo setProBono(boolean proBono) {
        this.proBono = proBono;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Processo{");
        sb.append("id=").append(id);
        sb.append(", numero='").append(numero).append('\'');
        sb.append(", dataDeDistribuicao=").append(dataDeDistribuicao);
        sb.append(", tipoDeAcao=").append(tipoDeAcao);
        sb.append(", advogado=").append(advogado);
        sb.append(", proBono=").append(proBono);
        sb.append('}');
        return sb.toString();
    }
}
