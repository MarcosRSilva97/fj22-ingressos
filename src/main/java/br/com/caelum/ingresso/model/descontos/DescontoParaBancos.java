package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;

public class DescontoParaBancos implements Desconto
{
	private BigDecimal trintaPorCento = new BigDecimal("0.3");
	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) 
	{
		return precoOriginal.subtract(trintaPorCentoSobre(precoOriginal));	
	}
	
	public BigDecimal trintaPorCentoSobre(BigDecimal precoOriginal)
	{
		return precoOriginal.multiply(trintaPorCento);
	}

	@Override
	public String getDescricao() 
	{
		return "Desconto Banco";
	}
}