CREATE TABLE Reservation_History
(
    id             VARCHAR(255) PRIMARY KEY,
    reservation_id VARCHAR(255) NOT NULL,
    user_id        VARCHAR(255) NOT NULL,
    class_id       VARCHAR(255) NOT NULL,
    action         VARCHAR(50)  NOT NULL, -- 예약 변경, 취소 등 액션 종류
    action_date    TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    details        TEXT,                  -- 변경 또는 취소된 상세 내용
    FOREIGN KEY (reservation_id) REFERENCES Reservation (id) ON DELETE CASCADE,
    FOREIGN KEY (user_id) REFERENCES User (id) ON DELETE CASCADE,
    FOREIGN KEY (class_id) REFERENCES Class (id) ON DELETE CASCADE
);
