package com.schedule.Aplication.repository;

import com.schedule.Aplication.model.FriendModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface FriendRepository extends JpaRepository<FriendModel, UUID> {

}
