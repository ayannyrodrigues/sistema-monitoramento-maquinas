import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SensorMaquinaComponent } from './sensor-maquina.component';

describe('SensorMaquinaComponent', () => {
  let component: SensorMaquinaComponent;
  let fixture: ComponentFixture<SensorMaquinaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SensorMaquinaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SensorMaquinaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
