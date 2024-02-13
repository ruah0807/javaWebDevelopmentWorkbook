package org.zerock.b01.domain;


import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
// 등록일, 수정일 같이 여러 엔티티에서 공통적으로 사용하는 매핑 정보만 상속받을 때 사용하는 기능
@EntityListeners(value = { AuditingEntityListener.class})
// 엔티티 변화의 감지, 테이블 데이터 조작
@Getter
abstract class BaseEntity {

    @CreatedDate
    @Column(name = "regdate", updatable = false)
    private LocalDateTime regDate;

    @LastModifiedDate
    @Column(name = "moddate")
    private LocalDateTime modDate;
}
