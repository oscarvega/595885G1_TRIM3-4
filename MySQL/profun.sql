-- funciones

create function pijamax.text6 (s varchar(20))
returns char (50)
return concat('hola',s,'!')
;

-- muestra el contenido de la funcion o procedimiento
show create function pijamax.text;

-- ejecutar procedimietnos
select pijamax.text6('hernando');

-- procedimiento
DELIMITER /
create procedure pijamax.tablaItem(numFactura int)
begin
select 
    t2.nombre_producto as 'nombre del producto',
    t1.cantidad 'cantidad producto',
    t1.costo_unitario as 'costo unitario',
    t1.costo_total as 'costo total'
from
    pijamax.item t1
        inner join
    pijamax.productos t2
        inner join
    pijamax.pedido t4
        inner join
    pijamax.factura t5 ON t1.id_producto = t2.id_producto
        and t1.id_pedido = t4.id_pedido
        and t4.id_pedido = t5.fk_pedido
and t5.id_factura= numFactura;

end/

-- ejecutar el procedimiento
call pijamax.tablaItem(8);



-- join con sentencias inner join
select 
    t2.nombre_producto as 'nombre del producto',
    t1.cantidad 'cantidad producto',
    t1.costo_unitario as 'costo unitario',
    t1.costo_total as 'costo total'
from
    pijamax.item t1
        inner join
    pijamax.productos t2
        inner join
    pijamax.pedido t4
        inner join
    pijamax.factura t5 ON t1.id_producto = t2.id_producto
        and t1.id_pedido = t4.id_pedido
        and t4.id_pedido = t5.fk_pedido
and t5.id_factura=7
;