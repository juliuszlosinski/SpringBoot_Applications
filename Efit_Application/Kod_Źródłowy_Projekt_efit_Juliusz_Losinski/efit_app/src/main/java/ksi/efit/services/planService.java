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

import ksi.efit.models.plan;
import ksi.efit.repositories.planRepository;

@Service
public class planService
{
	@Autowired
	planRepository repo;

	public planService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public <S extends plan> S save(S entity) {
		return repo.save(entity);
	}

	public <S extends plan> Optional<S> findOne(Example<S> example) {
		return repo.findOne(example);
	}

	public Page<plan> findAll(Pageable pageable) {
		return repo.findAll(pageable);
	}

	public List<plan> findAll() {
		return repo.findAll();
	}

	public List<plan> findAll(Sort sort) {
		return repo.findAll(sort);
	}

	public List<plan> findAllById(Iterable<Integer> ids) {
		return repo.findAllById(ids);
	}

	public Optional<plan> findById(Integer id) {
		return repo.findById(id);
	}

	public <S extends plan> List<S> saveAll(Iterable<S> entities) {
		return repo.saveAll(entities);
	}

	public void flush() {
		repo.flush();
	}

	public <S extends plan> S saveAndFlush(S entity) {
		return repo.saveAndFlush(entity);
	}

	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}

	public <S extends plan> List<S> saveAllAndFlush(Iterable<S> entities) {
		return repo.saveAllAndFlush(entities);
	}

	public <S extends plan> Page<S> findAll(Example<S> example, Pageable pageable) {
		return repo.findAll(example, pageable);
	}

	public void deleteInBatch(Iterable<plan> entities) {
		repo.deleteInBatch(entities);
	}

	public <S extends plan> long count(Example<S> example) {
		return repo.count(example);
	}

	public void deleteAllInBatch(Iterable<plan> entities) {
		repo.deleteAllInBatch(entities);
	}

	public <S extends plan> boolean exists(Example<S> example) {
		return repo.exists(example);
	}

	public long count() {
		return repo.count();
	}

	public void deleteById(Integer id) {
		repo.deleteById(id);
	}

	public <S extends plan, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return repo.findBy(example, queryFunction);
	}

	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		repo.deleteAllByIdInBatch(ids);
	}

	public void delete(plan entity) {
		repo.delete(entity);
	}

	public void deleteAllById(Iterable<? extends Integer> ids) {
		repo.deleteAllById(ids);
	}

	public void deleteAllInBatch() {
		repo.deleteAllInBatch();
	}

	public plan getOne(Integer id) {
		return repo.getOne(id);
	}

	public void deleteAll(Iterable<? extends plan> entities) {
		repo.deleteAll(entities);
	}

	public void deleteAll() {
		repo.deleteAll();
	}

	public plan getById(Integer id) {
		return repo.getById(id);
	}

	public <S extends plan> List<S> findAll(Example<S> example) {
		return repo.findAll(example);
	}

	public <S extends plan> List<S> findAll(Example<S> example, Sort sort) {
		return repo.findAll(example, sort);
	}
	
	
}
