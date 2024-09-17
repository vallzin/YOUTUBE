import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AppCursosCursoDetalheComponent } from './app-cursos-curso-detalhe.component';

describe('AppCursosCursoDetalheComponent', () => {
  let component: AppCursosCursoDetalheComponent;
  let fixture: ComponentFixture<AppCursosCursoDetalheComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AppCursosCursoDetalheComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AppCursosCursoDetalheComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
