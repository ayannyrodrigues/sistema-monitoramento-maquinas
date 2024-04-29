import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MaquinaLinhaDeProducaoComponent } from './maquina-linha-de-producao.component';

describe('MaquinaLinhaDeProducaoComponent', () => {
  let component: MaquinaLinhaDeProducaoComponent;
  let fixture: ComponentFixture<MaquinaLinhaDeProducaoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MaquinaLinhaDeProducaoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MaquinaLinhaDeProducaoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
