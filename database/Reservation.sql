CREATE TABLE Reservation
(
    id               VARCHAR(255) PRIMARY KEY,
    user_id          VARCHAR(255) NOT NULL,
    class_id         VARCHAR(255) NOT NULL,
    reservation_date TIMESTAMP    NOT NULL COMMENT '예약일시',
    quantity         INT          NOT NULL COMMENT '수량',
    status           VARCHAR(50)  NOT NULL COMMENT '예약 상태 (예: pending, confirmed, cancelled)',
    created_at       TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at       TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES User (id) ON DELETE CASCADE,
    FOREIGN KEY (class_id) REFERENCES Class (id) ON DELETE CASCADE
);
