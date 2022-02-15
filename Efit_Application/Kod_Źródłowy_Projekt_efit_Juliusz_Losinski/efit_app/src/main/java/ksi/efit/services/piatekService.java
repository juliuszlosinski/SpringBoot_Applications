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

import ksi.efit.models.piatek;
import ksi.efit.repositories.piatekRepository;

@Service
public class piatekService
{
	@Autowired
	piatekRepository repo;

	public piatekService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public <S extends piatek> S save(S entity) {
		return repo.save(entity);
	}

	public <S extends piatek> Optional<S> findOne(Example<S> example) {
		return repo.findOne(example);
	}

	public Page<piatek> findAll(Pageable pageable) {
		return repo.findAll(pageable);
	}

	public List<piatek> findAll() {
		return repo.findAll();
	}

	public List<piatek> findAll(Sort sort) {
		return repo.findAll(sort);
	}

	public List<piatek> findAllById(Iterable<Integer> ids) {
		return repo.findAllById(ids);
	}

	public Optional<piatek> findById(Integer id) {
		return repo.findById(id);
	}

	public <S extends piatek> List<S> saveAll(Iterable<S> entities) {
		return repo.saveAll(entities);
	}

	public void flush() {
		repo.flush();
	}

	public <S extends piatek> S saveAndFlush(S entity) {
		return repo.saveAndFlush(entity);
	}

	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}

	public <S extends piatek> List<S> saveAllAndFlush(Iterable<S> entities) {
		return repo.saveAllAndFlush(entities);
	}

	public <S extends piatek> Page<S> findAll(Example<S> example, Pageable pageable) {
		return repo.findAll(example, pageable);
	}

	public void deleteInBatch(Iterable<piatek> entities) {
		repo.deleteInBatch(entities);
	}

	public <S extends piatek> long count(Example<S> example) {
		return repo.count(example);
	}

	public void deleteAllInBatch(Iterable<piatek> entities) {
		repo.deleteAllInBatch(entities);
	}

	public <S extends piatek> boolean exists(Example<S> example) {
		return repo.exists(example);
	}

	public long count() {
		return repo.count();
	}

	public void deleteById(Integer id) {
		repo.deleteById(id);
	}

	public <S extends piatek, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return repo.findBy(example, queryFunction);
	}

	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		repo.deleteAllByIdInBatch(ids);
	}

	public void delete(piatek entity) {
		repo.delete(entity);
	}

	public void deleteAllById(Iterable<? extends Integer> ids) {
		repo.deleteAllById(ids);
	}

	public void deleteAllInBatch() {
		repo.deleteAllInBatch();
	}

	public piatek getOne(Integer id) {
		return repo.getOne(id);
	}

	public void deleteAll(Iterable<? extends piatek> entities) {
		repo.deleteAll(entities);
	}

	public void deleteAll() {
		repo.deleteAll();
	}

	public piatek getById(Integer id) {
		return repo.getById(id);
	}

	public <S extends piatek> List<S> findAll(Example<S> example) {
		return repo.findAll(example);
	}

	public <S extends piatek> List<S> findAll(Example<S> example, Sort sort) {
		return repo.findAll(example, sort);
	}
	
	
}
