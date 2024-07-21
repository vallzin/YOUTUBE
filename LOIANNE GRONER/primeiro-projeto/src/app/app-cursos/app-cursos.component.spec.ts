import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AppCursosComponent } from './app-cursos.component';

describe('AppCursosComponent', () => {
  let component: AppCursosComponent;
  let fixture: ComponentFixture<AppCursosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AppCursosComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AppCursosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
