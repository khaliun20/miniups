package com.miniups.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "AmazonSeq")
public class AmazonSeq {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "seq", nullable = false)
private Integer seq;

@Column(name = "message", nullable = false)
private String message;

@Column(name = "ack", nullable = false, columnDefinition = "boolean default false")
private Boolean ack;

// Constructor, getters, and setters

}
