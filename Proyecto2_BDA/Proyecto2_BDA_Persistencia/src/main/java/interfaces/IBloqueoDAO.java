/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.BloqueoDominio;
import java.util.List;

/**
 *
 * @author Sandra
 */
public interface IBloqueoDAO {
     List<BloqueoDominio> consultarBloqueos();
}
