import { ActionReducerMap, createFeatureSelector } from '@ngrx/store';

import * as fromClientes from './clientes.reducers';

export interface State {
  clientes: fromClientes.State;
}

export const reducers: ActionReducerMap<State> = {
  clientes: fromClientes.reducer
};

export const getState = createFeatureSelector<State>('catalogos');
