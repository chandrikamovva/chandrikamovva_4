package com.example.honeywell.cab.repository;



import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.example.honeywell.cab.constants.OnlineStatus;
import com.example.honeywell.cab.model.Driver;

/**
 * Database Access Object for driver table.
 * <p/>
 */
public interface DriverRepository extends CrudRepository<Driver, Long>
{
    Driver findByUsername(final String username);


    List<Driver> findByOnlineStatus(OnlineStatus onlineStatus);
}
