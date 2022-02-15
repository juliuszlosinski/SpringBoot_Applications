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

import ksi.efit.models.sobota;
import ksi.efit.repositories.sobotaRepository;

@Service		
public class sobotaService
{
	@Autowired
	sobotaRepository repo;

	public sobotaService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public <S extends sobota> S save(S entity) {
		return repo.save(entity);
	}

	public <S extends sobota> Optional<S> findOne(Example<S> example) {
		return repo.findOne(example);
	}

	public Page<sobota> findAll(Pageable pageable) {
		return repo.findAll(pageable);
	}

	public List<sobota> findAll() {
		return repo.findAll();
	}

	public List<sobota> findAll(Sort sort) {
		return repo.findAll(sort);
	}

	public List<sobota> findAllById(Iterable<Integer> ids) {
		return repo.findAllById(ids);
	}

	public Optional<sobota> findById(Integer id) {
		return repo.findById(id);
	}

	public <S extends sobota> List<S> saveAll(Iterable<S> entities) {
		return repo.saveAll(entities);
	}

	public void flush() {
		repo.flush();
	}

	public <S extends sobota> S saveAndFlush(S entity) {
		return repo.saveAndFlush(entity);
	}

	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}

	public <S extends sobota> List<S> saveAllAndFlush(Iterable<S> entities) {
		return repo.saveAllAndFlush(entities);
	}

	public <S extends sobota> Page<S> findAll(Example<S> example, Pageable pageable) {
		return repo.findAll(example, pageable);
	}

	public void deleteInBatch(Iterable<sobota> entities) {
		repo.deleteInBatch(entities);
	}

	public <S extends sobota> long count(Example<S> example) {
		return repo.count(example);
	}

	public void deleteAllInBatch(Iterable<sobota> entities) {
		repo.deleteAllInBatch(entities);
	}

	public <S extends sobota> boolean exists(Example<S> example) {
		return repo.exists(example);
	}

	public long count() {
		return repo.count();
	}

	public void deleteById(Integer id) {
		repo.deleteById(id);
	}

	public <S extends sobota, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return repo.findBy(example, queryFunction);
	}

	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		repo.deleteAllByIdInBatch(ids);
	}

	public void delete(sobota entity) {
		repo.delete(entity);
	}

	public void deleteAllById(Iterable<? extends Integer> ids) {
		repo.deleteAllById(ids);
	}

	public void deleteAllInBatch() {
		repo.deleteAllInBatch();
	}

	public sobota getOne(Integer id) {
		return repo.getOne(id);
	}

	public void deleteAll(Iterable<? extends sobota> entities) {
		repo.deleteAll(entities);
	}

	public void deleteAll() {
		repo.deleteAll();
	}

	public sobota getById(Integer id) {
		return repo.getById(id);
	}

	public <S extends sobota> List<S> findAll(Example<S> example) {
		return repo.findAll(example);
	}

	public <S extends sobota> List<S> findAll(Example<S> example, Sort sort) {
		return repo.findAll(example, sort);
	}

	
}
