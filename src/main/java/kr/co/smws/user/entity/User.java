package kr.co.smws.user.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "tbl_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(nullable = false, length = 45, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = true)
    private String nickname;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Setter
    @Column
    private String refreshToken;

    @Builder
    public User(String username, String password, String nickname, Role role) {

        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.role = role;
    }
}
