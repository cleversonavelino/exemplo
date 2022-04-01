package pucpr.br.exemplo.veiculo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pucpr.br.exemplo.veiculo.entity.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Integer> {

    @Query("select v from Veiculo v where v.placa = :placa")
    public Veiculo findByPlaca(String placa);

}
