package com.devsuperior.dscommerce.repositories;
import com.devsuperior.dscommerce.dto.UserDetailsProjection;
import com.devsuperior.dscommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

    @Query(nativeQuery = true, value = """
          SELECT tb_user.email AS username, tb_user.password, tb_roles.id AS roleId, tb_roles.authority
          FROM tb_user
          INNER JOIN tb_user_role ON tb_user.id = tb_user_role.user_id
          INNER JOIN tb_roles ON tb_roles.id = tb_user_role.role_id
          WHERE tb_user.email = :email
       """)
    List<UserDetailsProjection> searchUserAndRolesByEmail(String email);
}
