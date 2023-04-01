package br.com.pedidos.service;

import br.com.pedidos.domain.entity.Pedido;
import br.com.pedidos.domain.enums.StatusPedido;
import br.com.pedidos.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar( PedidoDTO dto );
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
