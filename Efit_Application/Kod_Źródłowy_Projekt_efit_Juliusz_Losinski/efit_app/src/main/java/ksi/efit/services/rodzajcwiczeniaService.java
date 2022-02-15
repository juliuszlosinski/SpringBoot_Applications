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

import ksi.efit.models.rodzajcwiczenia;
import ksi.efit.repositories.rodzajcwiczeniaRepository;

@Service
public class rodzajcwiczeniaService
{
	@Autowired
	rodzajcwiczeniaRepository repo;

	public rodzajcwiczeniaService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public <S extends rodzajcwiczenia> S save(S entity) {
		return repo.save(entity);
	}

	public <S extends rodzajcwiczenia> Optional<S> findOne(Example<S> example) {
		return repo.findOne(example);
	}

	public Page<rodzajcwiczenia> findAll(Pageable pageable) {
		return repo.findAll(pageable);
	}

	public List<rodzajcwiczenia> findAll() {
		return repo.findAll();
	}

	public List<rodzajcwiczenia> findAll(Sort sort) {
		return repo.findAll(sort);
	}

	public List<rodzajcwiczenia> findAllById(Iterable<String> ids) {
		return repo.findAllById(ids);
	}

	public Optional<rodzajcwiczenia> findById(String id) {
		return repo.findById(id);
	}

	public <S extends rodzajcwiczenia> List<S> saveAll(Iterable<S> entities) {
		return repo.saveAll(entities);
	}

	public void flush() {
		repo.flush();
	}

	public <S extends rodzajcwiczenia> S saveAndFlush(S entity) {
		return repo.saveAndFlush(entity);
	}

	public boolean existsById(String id) {
		return repo.existsById(id);
	}

	public <S extends rodzajcwiczenia> List<S> saveAllAndFlush(Iterable<S> entities) {
		return repo.saveAllAndFlush(entities);
	}

	public <S extends rodzajcwiczenia> Page<S> findAll(Example<S> example, Pageable pageable) {
		return repo.findAll(example, pageable);
	}

	public void deleteInBatch(Iterable<rodzajcwiczenia> entities) {
		repo.deleteInBatch(entities);
	}

	public <S extends rodzajcwiczenia> long count(Example<S> example) {
		return repo.count(example);
	}

	public void deleteAllInBatch(Iterable<rodzajcwiczenia> entities) {
		repo.deleteAllInBatch(entities);
	}

	public <S extends rodzajcwiczenia> boolean exists(Example<S> example) {
		return repo.exists(example);
	}

	public long count() {
		return repo.count();
	}

	public void deleteById(String id) {
		repo.deleteById(id);
	}

	public <S extends rodzajcwiczenia, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		return repo.findBy(example, queryFunction);
	}

	public void deleteAllByIdInBatch(Iterable<String> ids) {
		repo.deleteAllByIdInBatch(ids);
	}

	public void delete(rodzajcwiczenia entity) {
		repo.delete(entity);
	}

	public void deleteAllById(Iterable<? extends String> ids) {
		repo.deleteAllById(ids);
	}

	public void deleteAllInBatch() {
		repo.deleteAllInBatch();
	}

	public rodzajcwiczenia getOne(String id) {
		return repo.getOne(id);
	}

	public void deleteAll(Iterable<? extends rodzajcwiczenia> entities) {
		repo.deleteAll(entities);
	}

	public void deleteAll() {
		repo.deleteAll();
	}

	public rodzajcwiczenia getById(String id) {
		return repo.getById(id);
	}

	public <S extends rodzajcwiczenia> List<S> findAll(Example<S> example) {
		return repo.findAll(example);
	}

	public <S extends rodzajcwiczenia> List<S> findAll(Example<S> example, Sort sort) {
		return repo.findAll(example, sort);
	}

	
}
