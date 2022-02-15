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

import ksi.efit.models.wtorek;
import ksi.efit.repositories.wtorekRepository;

@Service
public class wtorekService
{
	@Autowired
	wtorekRepository repo;

	public wtorekService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public <S extends wtorek> S save(S entity) {
		return repo.save(entity);
	}

	public <S extends wtorek> Optional<S> findOne(Example<S> example) {
		return repo.findOne(example);
	}

	public Page<wtorek> findAll(Pageable pageable) {
		return repo.findAll(pageable);
	}

	public List<wtorek> findAll() {
		return repo.findAll();
	}

	public List<wtorek> findAll(Sort sort) {
		return repo.findAll(sort);
	}

	public List<wtorek> findAllById(Iterable<Integer> ids) {
		return repo.findAllById(ids);
	}

	public Optional<wtorek> findById(Integer id) {
		return repo.findById(id);
	}

	public <S extends wtorek> List<S> saveAll(Iterable<S> entities) {
		return repo.saveAll(entities);
	}

	public void flush() {
		repo.flush();
	}

	public <S extends wtorek> S saveAndFlush(S entity) {
		return repo.saveAndFlush(entity);
	}

	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}

	public <S extends wtorek> List<S> saveAllAndFlush(Iterable<S> entities) {
		return repo.saveAllAndFlush(entities);
	}

	public <S extends wtorek> Page<S> findAll(Example<S> example, Pageable pageable) {
		return repo.findAll(example, pageable);
	}

	public void deleteInBatch(Iterable<wtorek> entities) {
		repo.deleteInBatch(entities);
	}

	public <S extends wtorek> long count(Example<S> example) {
		return repo.count(example);
	}

	public void deleteAllInBatch(Iterable<wtorek> entities) {
		repo.deleteAllInBatch(entities);
	}

	public <S extends wtorek> boolean exists(Example<S> example) {
		return repo.exists(example);
	}

	public long count() {
		return repo.count();
	}

	public void deleteById(Integer id) {
		repo.deleteById(id);
	}

	public <S extends wtorek, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return repo.findBy(example, queryFunction);
	}

	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		repo.deleteAllByIdInBatch(ids);
	}

	public void delete(wtorek entity) {
		repo.delete(entity);
	}

	public void deleteAllById(Iterable<? extends Integer> ids) {
		repo.deleteAllById(ids);
	}

	public void deleteAllInBatch() {
		repo.deleteAllInBatch();
	}

	public wtorek getOne(Integer id) {
		return repo.getOne(id);
	}

	public void deleteAll(Iterable<? extends wtorek> entities) {
		repo.deleteAll(entities);
	}

	public void deleteAll() {
		repo.deleteAll();
	}

	public wtorek getById(Integer id) {
		return repo.getById(id);
	}

	public <S extends wtorek> List<S> findAll(Example<S> example) {
		return repo.findAll(example);
	}

	public <S extends wtorek> List<S> findAll(Example<S> example, Sort sort) {
		return repo.findAll(example, sort);
	}
	
	
}
