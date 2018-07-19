/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Entities.Media;

/**
 *
 * @author ATANDA
 */
public class MediaRepository extends BaseRepository{
    
     public MediaRepository() {
    }

    public MediaRepository(String unitPersistence) {
        super(unitPersistence, Media.class);
    }
    
    
}
