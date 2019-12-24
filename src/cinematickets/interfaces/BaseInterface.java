/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematickets.interfaces;

/**
 *
 * @author udin
 */
public interface BaseInterface {
    public Object create(Object Object);

    public boolean edit(Object Object);

    public boolean delete(Object Object);

    public boolean update(Object Object);

    public Object search(Object Object);
}
