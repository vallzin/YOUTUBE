import { TestBed } from '@angular/core/testing';

import { AppCursosService } from './app-cursos.service';

describe('AppCursosService', () => {
  let service: AppCursosService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AppCursosService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
