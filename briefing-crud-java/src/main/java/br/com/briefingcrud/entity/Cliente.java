package br.com.briefingcrud.entity;

import java.util.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Cliente {

	private Long id;
    private String nome;
    private String email;
    private Integer idade;
    private Date dataInclusao;
    private Date dataAlteracao;
}