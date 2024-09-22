CREATE TABLE Class
(
    id          VARCHAR(255) PRIMARY KEY,
    title       VARCHAR(255)   NOT NULL,
    description TEXT,
    price       DECIMAL(10, 2) NOT NULL,
    start_time  TIMESTAMP      NOT NULL,
    end_time    TIMESTAMP      NOT NULL,
    latitude    DECIMAL(9, 6),
    longitude   DECIMAL(9, 6),
    capacity    INT            NOT NULL,
    created_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
