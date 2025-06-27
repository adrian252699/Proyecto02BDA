/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import DTOs.NuevoAdministradorDTO;
import entidades.AdministradorDominio;
import java.util.List;

/**
 *
 * @author jalt2
 */
public interface IAdministradorDAO {
    public AdministradorDominio agregarAdministrador(NuevoAdministradorDTO nuevoAdministrador);
    public AdministradorDominio consultarAdinistrador(Long id);
    public List<AdministradorDominio> consultarAdministradores();
}
