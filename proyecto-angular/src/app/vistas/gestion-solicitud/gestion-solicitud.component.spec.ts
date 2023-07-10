import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GestionSolicitudComponent } from './gestion-solicitud.component';

describe('GestionSolicitudComponent', () => {
  let component: GestionSolicitudComponent;
  let fixture: ComponentFixture<GestionSolicitudComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GestionSolicitudComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GestionSolicitudComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
