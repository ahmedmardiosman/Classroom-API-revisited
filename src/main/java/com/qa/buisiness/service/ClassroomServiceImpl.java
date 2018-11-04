package com.qa.buisiness.service;

import javax.inject.Inject;

import com.qa.persistence.repository.ClassroomRepository;

public class ClassroomServiceImpl implements ClassroomService {

	@Inject
	private ClassroomRepository repo;

	public String getAllClassrooms() {
		return repo.getAllClassrooms();
	}

	public String getAllTrainees() {
		return repo.getAllTrainees();

	}

	public String createClassroom(String classroom) {
		return repo.createClassroom(classroom);
	}

	public String createTrainee(String trainee) {
		return repo.createTrainee(trainee);
	}

	public String updateClassroom(String classroom) {

		return repo.updateClassroom(classroom);
	}

	public String deleteClassroom(Long classroomID) {

		return repo.deleteClassroom(classroomID);
	}

	public String deleteTrainee(Long classroomID) {

		return repo.deleteClassroom(classroomID);
	}

	public void setRepo(ClassroomRepository repo) {
		this.repo = repo;
	}

}
