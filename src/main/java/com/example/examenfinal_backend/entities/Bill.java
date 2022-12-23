package com.example.examenfinal_backend.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class Bill {
    @Id
	@SequenceGenerator(name="bill_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="bill_id_seq")
	private Integer id;
	
	private Date date_bill;

	private String value;

    private Integer type;

    private String observation;

    @OneToMany
	@JoinColumn(name="user_id")
	private Users users ;
	
}
