package ksi.efit.services;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import ksi.efit.repositories.czwartekRepository;
import ksi.efit.models.czwartek;

@Service
public class czwartekService
{
	@Autowired
	czwartekRepository czwartek;

	public czwartekService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public <S extends ksi.efit.models.czwartek> S save(S entity) {
		return czwartek.save(entity);
	}

	public <S extends ksi.efit.models.czwartek> Optional<S> findOne(Example<S> example) {
		return czwartek.findOne(example);
	}

	public Page<ksi.efit.models.czwartek> findAll(Pageable pageable) {
		return czwartek.findAll(pageable);
	}

	public List<ksi.efit.models.czwartek> findAll() {
		return czwartek.findAll();
	}

	public List<ksi.efit.models.czwartek> findAll(Sort sort) {
		return czwartek.findAll(sort);
	}

	public List<ksi.efit.models.czwartek> findAllById(Iterable<Integer> ids) {
		return czwartek.findAllById(ids);
	}

	public Optional<ksi.efit.models.czwartek> findById(Integer id) {
		return czwartek.findById(id);
	}

	public <S extends ksi.efit.models.czwartek> List<S> saveAll(Iterable<S> entities) {
		return czwartek.saveAll(entities);
	}

	public void flush() {
		czwartek.flush();
	}

	public <S extends ksi.efit.models.czwartek> S saveAndFlush(S entity) {
		return czwartek.saveAndFlush(entity);
	}

	public boolean existsById(Integer id) {
		return czwartek.existsById(id);
	}

	public <S extends ksi.efit.models.czwartek> List<S> saveAllAndFlush(Iterable<S> entities) {
		return czwartek.saveAllAndFlush(entities);
	}

	public <S extends ksi.efit.models.czwartek> Page<S> findAll(Example<S> example, Pageable pageable) {
		return czwartek.findAll(example, pageable);
	}

	public void deleteInBatch(Iterable<ksi.efit.models.czwartek> entities) {
		czwartek.deleteInBatch(entities);
	}

	public <S extends ksi.efit.models.czwartek> long count(Example<S> example) {
		return czwartek.count(example);
	}

	public void deleteAllInBatch(Iterable<ksi.efit.models.czwartek> entities) {
		czwartek.deleteAllInBatch(entities);
	}

	public <S extends ksi.efit.models.czwartek> boolean exists(Example<S> example) {
		return czwartek.exists(example);
	}

	public long count() {
		return czwartek.count();
	}

	public void deleteById(Integer id) {
		czwartek.deleteById(id);
	}

	public <S extends ksi.efit.models.czwartek, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		return czwartek.findBy(example, queryFunction);
	}

	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		czwartek.deleteAllByIdInBatch(ids);
	}

	public void delete(ksi.efit.models.czwartek entity) {
		czwartek.delete(entity);
	}

	public void deleteAllById(Iterable<? extends Integer> ids) {
		czwartek.deleteAllById(ids);
	}

	public void deleteAllInBatch() {
		czwartek.deleteAllInBatch();
	}

	public ksi.efit.models.czwartek getOne(Integer id) {
		return czwartek.getOne(id);
	}

	public void deleteAll(Iterable<? extends ksi.efit.models.czwartek> entities) {
		czwartek.deleteAll(entities);
	}

	public void deleteAll() {
		czwartek.deleteAll();
	}

	public ksi.efit.models.czwartek getById(Integer id) {
		return czwartek.getById(id);
	}

	public <S extends ksi.efit.models.czwartek> List<S> findAll(Example<S> example) {
		return czwartek.findAll(example);
	}

	public <S extends ksi.efit.models.czwartek> List<S> findAll(Example<S> example, Sort sort) {
		return czwartek.findAll(example, sort);
	}

	
	
	
}
