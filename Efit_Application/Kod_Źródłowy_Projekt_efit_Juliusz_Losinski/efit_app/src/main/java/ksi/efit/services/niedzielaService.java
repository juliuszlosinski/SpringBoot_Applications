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

import ksi.efit.models.niedziela;
import ksi.efit.repositories.niedzielaRepository;

@Service
public class niedzielaService
{
	@Autowired
	niedzielaRepository repo;

	public niedzielaService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public <S extends niedziela> S save(S entity) {
		return repo.save(entity);
	}

	public <S extends niedziela> Optional<S> findOne(Example<S> example) {
		return repo.findOne(example);
	}

	public Page<niedziela> findAll(Pageable pageable) {
		return repo.findAll(pageable);
	}

	public List<niedziela> findAll() {
		return repo.findAll();
	}

	public List<niedziela> findAll(Sort sort) {
		return repo.findAll(sort);
	}

	public List<niedziela> findAllById(Iterable<Integer> ids) {
		return repo.findAllById(ids);
	}

	public Optional<niedziela> findById(Integer id) {
		return repo.findById(id);
	}

	public <S extends niedziela> List<S> saveAll(Iterable<S> entities) {
		return repo.saveAll(entities);
	}

	public void flush() {
		repo.flush();
	}

	public <S extends niedziela> S saveAndFlush(S entity) {
		return repo.saveAndFlush(entity);
	}

	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}

	public <S extends niedziela> List<S> saveAllAndFlush(Iterable<S> entities) {
		return repo.saveAllAndFlush(entities);
	}

	public <S extends niedziela> Page<S> findAll(Example<S> example, Pageable pageable) {
		return repo.findAll(example, pageable);
	}

	public void deleteInBatch(Iterable<niedziela> entities) {
		repo.deleteInBatch(entities);
	}

	public <S extends niedziela> long count(Example<S> example) {
		return repo.count(example);
	}

	public void deleteAllInBatch(Iterable<niedziela> entities) {
		repo.deleteAllInBatch(entities);
	}

	public <S extends niedziela> boolean exists(Example<S> example) {
		return repo.exists(example);
	}

	public long count() {
		return repo.count();
	}

	public void deleteById(Integer id) {
		repo.deleteById(id);
	}

	public <S extends niedziela, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return repo.findBy(example, queryFunction);
	}

	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		repo.deleteAllByIdInBatch(ids);
	}

	public void delete(niedziela entity) {
		repo.delete(entity);
	}

	public void deleteAllById(Iterable<? extends Integer> ids) {
		repo.deleteAllById(ids);
	}

	public void deleteAllInBatch() {
		repo.deleteAllInBatch();
	}

	public niedziela getOne(Integer id) {
		return repo.getOne(id);
	}

	public void deleteAll(Iterable<? extends niedziela> entities) {
		repo.deleteAll(entities);
	}

	public void deleteAll() {
		repo.deleteAll();
	}

	public niedziela getById(Integer id) {
		return repo.getById(id);
	}

	public <S extends niedziela> List<S> findAll(Example<S> example) {
		return repo.findAll(example);
	}

	public <S extends niedziela> List<S> findAll(Example<S> example, Sort sort) {
		return repo.findAll(example, sort);
	}
	
	
}
