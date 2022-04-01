package pucpr.br.exemplo.veiculo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pucpr.br.exemplo.veiculo.entity.Veiculo;
import pucpr.br.exemplo.veiculo.repository.VeiculoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class VeiculoService {

    Logger logger = Logger.getLogger(VeiculoService.class.getName());

    @Autowired
    private VeiculoRepository veiculoRepository;

    public Veiculo salvar(Veiculo veiculo) {
        logger.info("Salvar veiculo");
        veiculoRepository.save(veiculo);
        return veiculo;
    }

    public List<Veiculo> listar() {
        logger.info("Listar veiculos");
       return veiculoRepository.findAll();
    }

    public void excluir(Veiculo veiculo) {
        veiculoRepository.delete(veiculo);
    }

    public Veiculo buscarPorId(Integer id) {
        return veiculoRepository.findById(id).get();
    }

}
