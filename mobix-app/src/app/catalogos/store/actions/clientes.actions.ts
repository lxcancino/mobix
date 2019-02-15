import { Action } from '@ngrx/store';
import { Update } from '@ngrx/entity';

import { Cliente } from '../../../models';

export enum ClienteActionTypes {
  LoadClientes = '[Clientes Guard] Load Clientes',
  LoadClientesFail = '[Cliente API] Load Clientes fail',
  LoadClientesSuccess = '[Cliente API] Load Clientes Success'
}

export class LoadClientes implements Action {
  readonly type = ClienteActionTypes.LoadClientes;
}
export class LoadClientesFail implements Action {
  readonly type = ClienteActionTypes.LoadClientesFail;
  constructor(public payload: { response: any }) {}
}
export class LoadClientesSuccess implements Action {
  readonly type = ClienteActionTypes.LoadClientesSuccess;

  constructor(public payload: { Clientes: Cliente[] }) {}
}

export type ClienteActions =
  | LoadClientes
  | LoadClientesFail
  | LoadClientesSuccess;
