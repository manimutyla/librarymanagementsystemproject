package com.capgemini.librarymanagementsystemspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.librarymanagementsystemspring.dao.StudentDAO;
import com.capgemini.librarymanagementsystemspring.dto.BookBean;

@Service
public class StudentServiceImplementation implements StudentService{
	@Autowired
	private StudentDAO dao;
	@Override
	public BookBean searchBookTitle(String name) {
		return dao.searchBookTitle(name);
	}

	@Override
	public BookBean searchBookAuthor(String Author) {
		return dao.searchBookAuthor(Author);
	}

	@Override
	public List<Integer> getBookIds() {
		return dao.getBookIds();
	}

	@Override
	public List<BookBean> getBooksInfo() {
		return dao.getBooksInfo();
	}

	@Override
	public BookBean searchBookType(int bookType) {
		return dao.searchBookType(bookType);
	}

	@Override
	public boolean req(int id, int book_id) {
		return dao.req(id, book_id);
	}

	@Override
	public boolean reqReturnBook(int id, int book_id) {
		return dao.reqReturnBook(id, book_id);
	}

}
